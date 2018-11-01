; https://projecteuler.net/problem=3
; Largest prime factor
; Problem 3

; The prime factors of 13195 are 5, 7, 13 and 29.

; What is the largest prime factor of the number 600851475143 ?


(defn is_prime?
    ([a] (is_prime? a 2))
    ([a b]
        (cond
            (= a b) true
            (= (mod a b) 0) false
            :else (recur a (+ b 1))
        )
    )
)


(defn next_prime [n]
    (if (is_prime? (+ 1 n))
        (+ 1 n)
        (recur (+ 1 n))
    )
)


(defn factor
    ([n] (factor n 1))
    ([n max_factor]
        (cond
            (= n (next_prime max_factor)) (next_prime max_factor)
            (= (mod n (next_prime max_factor)) 0) (recur (/ n (next_prime max_factor)) max_factor)
            :else (recur n (next_prime max_factor))
        )
    )
)