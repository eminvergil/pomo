(ns pomo.core
  (:require [sablono.core :as sab]))

(def app-state (atom {:cont 0}))

(defn county [data]
  (sab/html [:div
             [:h1 "count : " (:cont @data)]
             [:div [:a {:href "#"
                        :onClick #(swap! data update-in [:cont] inc)}
                    "increase count"]]]))

(defn render! []
  (.render js/ReactDOM
           (county app-state)
           (.getElementById js/document "app")))


(add-watch app-state :on-change (fn [_ _ _ _] (render!)))


(render!)
