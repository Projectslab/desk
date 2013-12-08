(ns desk.config.db
  (:require [datomic.api :as d]))

(def uri "datomic:couchbase://localhost/desk/deskdb?password=1234")

(d/create-database uri)
(def conn (d/connect uri))
(def db (d/db conn))
db
