(ns pomo.core
    (:require [reagent.core :as reagent :refer [atom]]))

(enable-console-print!)

(def app-state (atom {:text "Example"}))

;; some comments 

(defn hello-world []
  [:div
   [:h1 (:text @app-state)]
   #_[--function--]
   [:h2 "some text whatsup"]
   ])

(defn some-func [xx]
  (* 2 xx))

(reagent/render-component [hello-world]
                          (. js/document (getElementById "app")))

(defn on-js-reload [])
