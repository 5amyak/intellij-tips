# IntelliJ Tricks by Victor Rentea, Software Crafter and Trainer

### Typing
- Autocompletion based on contains or first letter
  - person.firstName < person.fn < p.fn
- Type-aware smart completion: CTRL+SHIFT+SPACE
- Boilerplate: toString, getters, setters
- TAB completion to replace with suggestion

### Wrapping
- Finish Statement (CMD+SHIFT+ENTER) 
  - if, method, class
  - wrap method call: ofNullable(
  - wrap generics: Optional<
- Surround with (CMD+SHIFT+S): if, try

### Templates
- Postfix Completion: .sout .if .for .return
  - CUSTOM: .log ($EXPR$.log) .assertThat
- Live Templates: boot, main
  - CUSTOM: logs

### Navigation | Selection
- Back/Forward (CMD+]/[)
- Recent Files (CMD+E)
- Multi-cursor: Token Based (CMD+D)
- Find Text (CMD+SHIFT+F)

### Code inspection / Surviving Legacy
- Current Parameter (CMD+P)
- Type of current expression (Ctrl+Shift+P)
- Call hierarchy (CTRL+OPT+H)
- Quick Definition (OPT+SPACE)
- Expand/Contract Selection (OPT+UP/DOWN)
- Contract
  - All: (CMD+SHIFT+MINUS)
  - Current: (CMD+.)
- Expand
  - All: (CMD+SHIFT+PLUS)
  - Current: (CMD+.)

### FP Support
- ALT-Enter on .stream <-> for
- Skip writing ".stream()"
- Autocomplete after directly after ::
- Collecting: ctl, cs, cj

### 👑 Quick Fix (aka Inspections) (OPT+ENTER):
- Define variable for expression
- Move variable definition closer to usage
- error, warn, typo, gray, refactor
- and 500+ more 😊 => almost all are disabled by default

### Refactoring (CMD+SHIFT+R)
- Introduce Parameter, Functional Parameter, and Parameter Object
- Add/Remove param from inside / from outside w/ ALT-ENTER 

- Extract Method (+ Auto-Parameterize)
- Combo: Extract over & Inline inner
- Combo: Extract & Move/Convert to Instance

- Extract / Inline / Encapsulate Field
- Extract explanatory variable (w or w/o preselecting)
- Extract / Inline Interface