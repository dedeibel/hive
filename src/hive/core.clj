(ns hive.core
  (:import [name.benjaminpeter.hyphen Hyphen]))

(defn -main
  []
  (let [text "Dies ist ein Test, er testet das Trenne von Worten
              Zehn Ziegen ziehen zehn Zentner Zucker zum Zoo."
        words (clojure.string/split text #" +")
        dictPath "./data/hyph_de_DE.dic"
        dictionary (-> (Hyphen/getInstance) (.getDictionary dictPath))]
    (println (clojure.string/join " "
                         (for [word words]
                           (clojure.string/join "&shy;"
                                                (.syllables dictionary word)))))))

