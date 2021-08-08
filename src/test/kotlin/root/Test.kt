package root

import io.kotest.core.spec.style.StringSpec

class Test : StringSpec({
    "failed test" { generateId() }
})