(ns reagent-mui.x.data-grid
  "Imports @mui/x-data-grid as a Reagent component.
  Original documentation is at https://mui.com/components/data-grid/ ."
  (:require-macros [reagent-mui.util :refer [with-unchanged-js-props]])
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-data-grid" :as DataGrid]))

(def data-grid (with-unchanged-js-props (adapt-react-class (.-DataGrid DataGrid) "mui-data-grid")))
