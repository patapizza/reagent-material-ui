(ns reagent-mui.material.use-form-control
  "Imports @mui/material/FormControl/useFormControl as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/api/use-form-control/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/material/FormControl" :as MuiFormControl]))

(def use-form-control (wrap-js-function (.-useFormControl MuiFormControl)))
