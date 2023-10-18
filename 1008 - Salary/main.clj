(let [
      number (read-string (read-line))
      worked-hours (int (read-string (read-line)))
      amount-received (float (read-string (read-line)))
      ]
  [
   (println "NUMBER =" number)
   (println "SALARY = U$" (format "%.2f" (* worked-hours amount-received)))
   ])

