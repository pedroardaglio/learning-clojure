; https://projecteuler.net/problem=1
; Multiples of 3 and 5
; Problem 1

; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

; Find the sum of all the multiples of 3 or 5 below 1000.

(defn sum_multiples_3_5
    ([] (sum_multiples_3_5 999))
    ([x]
        (cond
            (= x 0) (+ x 0)
            (= (mod x 3) 0) (+ (sum_multiples_3_5 (- x 1)) x)
            (= (mod x 5) 0) (+ (sum_multiples_3_5 (- x 1)) x)
            :else (sum_multiples_3_5 (- x 1))
        )
    )
)
