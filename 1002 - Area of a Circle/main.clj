(defn exp [x n]
  (if (zero? n) 1
                (* x (exp x (dec n)))))

(def a (read-string (read-line)))

(printf "A=%.4f\n" (* (exp a 2) 3.14159) )
