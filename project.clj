(defproject pomo "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.908"]
                 [cljsjs/react "15.2.1-1"]
                 [cljsjs/react-dom"15.2.1-1"]
                 [sablono "0.7.4"]]
  :plugins [[lein-figwheel "0.5.13"]]
  :clean-targets [:target-path "out"]
  :cljsbuild {
              :builds [{:id "dev"
                        :source-paths ["src"]
                        :figwheel true
                        :compiler {:main "pomo.core"}}]
              })

