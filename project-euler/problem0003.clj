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
            :else (is_prime? a (+ b 1))
        )
    )
)


(defn next_prime [n]
    (if (is_prime? (+ 1 n))
        (+ 1 n)
        (next_prime (+ 1 n))
    )
)

(defn factor
    ([n]
        (loop [x n max_factor 1]
            (let [new_factor (next_prime max_factor)]
                (cond
                    (= n new_factor) new_factor
                    (= (mod n new_factor) 0) (recur (/ n new_factor) new_factor)
                    :else (recur n new_factor)
                )
            )
        )
    )
)
