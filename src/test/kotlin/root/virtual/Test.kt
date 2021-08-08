package root.virtual

import io.kotest.core.spec.style.StringSpec
import root.generateId

class Test : StringSpec({
    "failed test" { generateId() }
})