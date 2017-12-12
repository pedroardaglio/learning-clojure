(defn prime_aux [x y]
    (if (= y 1)
        true
        (if (= (mod x y) 0)
            false
            (do (prime_aux x (- y 1)))
        )
    )
)

(defn prime [x]
    (prime_aux x (- x 1))
)
