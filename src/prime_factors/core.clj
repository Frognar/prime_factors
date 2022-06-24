(ns prime-factors.core)

(defn prime-factors-of [n]
  (loop [n n, div 2, factors []]
    (cond (= n 1) factors
          (zero? (mod n div)) (recur (/ n div) div (conj factors div))
          :else (recur n (inc div) factors))
    ))