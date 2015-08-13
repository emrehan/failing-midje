(defproject project "1.0"
  :min-lein-version "2.0.0"
  :main project.core
  :plugins [[lein-midje "3.1.3"]]
  :dependencies [[midje "1.7.0"]
                 [org.clojure/clojure "1.7.0"]
                 [ring/ring-devel "1.4.0"]])
