(ns prime-factors.core-spec
  (:require [speclj.core :refer :all]
            [prime-factors.core :refer :all]))

(describe "Prime factors"
  (let [cases {1 []
               2 [2]
               3 [3]
               4 [2 2]
               5 [5]
               6 [2 3]
               7 [7]
               8 [2 2 2]
               9 [3 3]
               10 [2 5]
               (* 2 3 5 7 11 13 17) [2 3 5 7 11 13 17]}]
    (for [[input expected] cases]
      (it (format "should be %s for prime factors of %s" expected input)
          (should= expected (prime-factors-of input)))))
)

(run-specs)