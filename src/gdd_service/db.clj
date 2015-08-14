(ns gdd-service.db
  (:require [clojure.java.jdbc :as j]))

(def postgress-connection
  {:subprotocol "postgresql"
   :subname "//brian-hackday.czas5cnicq66.us-east-1.rds.amazonaws.com:5432/farmlogs_rtma_data"
   :user "gf8gtyxqredf9q6"
   :password "zd6vgwc3i2zkpgs"})

(def query
  []
  (j/query postgress-connection
           ["select * from rtma_grids"]))
