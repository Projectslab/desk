(ns desk.models.user
  (:require [datomic.api :as d :refer [q db entity]]
            [desk.config.db :as config])
  )

;; User entity
;; name
;; email
;; password
(def dbb (db config/conn))

(def user-data [{ :db/id (d/tempid :db.part/user)
                  :user/email "goracioo@ya.ru"
                  :user/name "Roman"
                  :user/password "123456"
                 }])
(defn add-user []
  (d/transact config/conn user-data))

;; Model functions
(defn find-user []
  (q '[:find ?e
       :where [?e :user/name "Roman"] ]
      dbb))
(def ent (d/entity  dbb (ffirst (find-user))))
