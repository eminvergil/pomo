(ns pomo.core
    (:require [reagent.core :as reagent :refer [atom]]))

(enable-console-print!)

(def app-state (atom {:text "Example"}))


(defn hello-world []
  [:div
   [:h1 (:text @app-state)]
   #_[--function--]
   ])

(reagent/render-component [hello-world]
                          (. js/document (getElementById "app")))

(defn on-js-reload [])
