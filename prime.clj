;; Check if a number is prime

(defn prime
    ([x] (prime x (- x 1)))
    ([x y]
        (if (= y 1)
            true
            (if (= (mod x y) 0)
                false
                (do (prime x (dec y)))
            )
        )
    )
)
