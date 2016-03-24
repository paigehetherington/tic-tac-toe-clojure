(ns tic-tac-toe-clojure.core
  (:gen-class))

(def board [[:e :x :e]
            [:o :o :o]
            [:x :e :x]])

(defn solve [x] ; destructuring
  (let [[[a b c]
         [d e f]
         [g h i]] x
        solutions (hash-set
                    [a b c]
                    [d e f]
                    [g h i]
                    [a d g]
                    [b e h]
                    [c f i]
                    [a e i]
                    [c e g])]
    (cond
      (contains? solutions [:x :x :x]) :x ; if true return x
      (contains? solutions [:o :o :o]) :o ; if true return o
      :else nil)))
                      
    ;(println a b c d e f g h i)))
        

(defn -main []
  (println "Hello, World!"))
