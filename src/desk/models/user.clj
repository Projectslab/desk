(ns desk.models.user )

(def user-schema
  [{:db/doc "User email address"
    :db/ident :user/email
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/one
    :db/unique :db.unique/identity
    :db/id #db/id[:db.part/db]
    :db.install/_attribute :db.part/db}

   {:db/doc "User name"
    :db/ident :user/name
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/one
    :db/index true
    :db/id #db/id[:db.part/db]
    :db.install/_attribute :db.part/db}

   {:db/doc "User password"
    :db/ident :user/password
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/one
    :db/id #db/id[:db.part/db]
    :db.install/_attribute :db.part/db}])
