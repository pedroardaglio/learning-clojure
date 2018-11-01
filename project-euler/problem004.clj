; https://projecteuler.net/problem=4
; Largest Palindrome Product
; Problem 4

; A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

; Find the largest palindrome made from the product of two 3-digit numbers.


(defn is_3_digit? [n]
  (= (count (.toString n)) 3)
)

(defn prev_3_digit [n]
  (let [prev (- n 1)]
    (if (is_3_digit? prev) prev false)
  )
)

(defn is_palindrome? [s]
  (= s (apply str (reverse s)))
)
