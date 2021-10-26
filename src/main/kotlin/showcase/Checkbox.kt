package showcase

import mui.material.Checkbox
import react.Props
import react.fc

val CheckboxShowcase = fc<Props> {
    Checkbox {
        attrs.asDynamic().defaultChecked = true // TODO: Unable to use defaultChecked legally [MUI]
    }
    Checkbox {
    }
    Checkbox {
        attrs.disabled = true
    }
    Checkbox {
        attrs.disabled = true
        attrs.checked = true
    }
}