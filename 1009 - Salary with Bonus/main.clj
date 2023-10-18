(let [
      _ (read-string (read-line))
      salary (float (read-string (read-line)))
      products-sold (float (read-string (read-line)))
      result (+ salary (* products-sold 0.15))]

  [
   (println "TOTAL = R$" (format "%.2f" (if (and (= (mod (int (* result 1000)) 10) 5) (even? (int (* result 100)))) (- result 0.01) result)))
   ]
  )

