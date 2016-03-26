; exercise to practice conditionals
(defn y-within-frame
  [y]
  (if (< (+ y 40) 150)
    (+ y 40)
    -150))
(y-within-frame 80)
(y-within-frame 180)

(cond (< (+ y 40) 150)
      -150
      (> (+ y 40) -150)
      -150
      :else (+ y 40))
