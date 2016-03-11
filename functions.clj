; define forward-right function
(defn forward-right
  [turtle]
  (forward turtle 60)
  (right turtle 135))
(forward-right :neo) ;=> {:neo {:angle 135}}
; define function with multiple args
(defn forward-right-with-len
; multiple args
  [turtle len]
  (forward turtle len)
  (right turtle 135))
(forward-right-with-len :neo 90) ;=> {:trinity {:angle 90}}
