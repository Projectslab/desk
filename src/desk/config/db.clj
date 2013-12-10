(ns desk.config.db
  (:require [datomic.api :as d]))

(def uri "datomic:couchbase://localhost/desk/deskdb?password=1234")


(d/create-database uri)
(def conn (d/connect uri))

(defn load-user-schema []
  (let [user-schema (load-file "resources/datomic/user.edn")]
  (d/transact conn user-schema )))

;(load-user-schema)

;(load-file "resources/datomic/user.edn")
