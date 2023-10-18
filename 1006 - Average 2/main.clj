  (def a (read-string (read-line)))
  (def b (read-string (read-line)))
  (def c (read-string (read-line)))

  (printf "MEDIA = %.1f\n" (float (/ (+ (* 2 a) (* 3 b) (* 5 c)) 10)))
