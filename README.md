# Groovy NullPointerException in Arithmetic Operations

This repository demonstrates a common issue in Groovy where null values in arithmetic operations are implicitly treated as 0.  While convenient, this behavior can mask subtle bugs, especially when dealing with external data or unexpected null values.

The `bug.groovy` file shows the problem.  The `calculate` function silently returns 0 when null is passed in, instead of throwing a `NullPointerException`. The `bugSolution.groovy` demonstrates a better approach.

## How to reproduce

1. Clone this repository.
2. Run `groovy bug.groovy`.
3. Observe the output; note that null inputs do not generate exceptions.

## Solution

The ideal approach is to make the function aware of the potential for null values and handle them appropriately, as shown in `bugSolution.groovy`.