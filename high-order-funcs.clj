; map
(map name (turtle-names)) ;=> ("trini" "neo" "oracle" "cypher")
(map (partial + 90) [0 30 60 90]) ;=> (90 120 150 180)
; reduce
; exercise: create a function that takes a vector of maps & calculates avg

(defn avg
  [coll]
  (/ (reduce + (map :angle coll))
     (count coll)))

(avg [{:angle 30} {:angle 90} {:angle 50}])
