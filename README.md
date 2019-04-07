# regEx-NIE-DNI
## Objective:
1. Validation of DNI and NIE through regular expressions.

The solution we programmed a few days ago to check if a DNI was valid only works correctly for "Spaniards with a national identity 
document (*DNI*) assigned by the Ministry of the Interior".

We are now charged with extending the program so that it also validates the `NIE` or foreign identity number, a document for 
"*foreigners residing in Spain and identified by the Police*".

**The NIE format is**:
- Letter X + 7 numbers + check digit.
- Letter Y + 7 numbers + check digit.
- Letter Z + 7 numbers + check digit.
(*according to the Tax Identification Number in Wikipedia*).

**Examples**:
~~~
"X1234567T", "Y1234567T", "Z1234567T"
~~~

## Regular expressions

**Writing rules**:

First you have to understand what a regular expression is and what are the rules by which they are written. Then, you have to learn 
how to use them in Java.

### Regular expressions are patterns that select (*filter*) certain character strings when applied to a string.

**Examples**:

`[abc]` selects a character that will be a, b, or c.

`[^ xyz]` selects a character except for x, y, z.

`[a-p]` selects a character between a and p.

`[a-cx-z]` selects a character between a and c, or between x and z, which would include a, b, c, x, y, z.

`[a-z && [^ aeiou]]` selects a lowercase letter minus the vowels. In other words, a lowercase consonant.

`[a-zA-Z]` + selects any word in a string. For example: "All words in this phrase are selected."

`\b\w{4}\b` selects 4-letter words in a string. For example: "drink beer, it's very nice!"

`\b\d{3}[-.]?\d{3}[-.]?\d{4}\b` selects phones in a string with the following formats: 444-555-1234, 246.555.8888, 1235554567.

### Write a Java program that, using one (or several) regular expression that you design, validates whether the syntax of a DNI or an NIE is correct. That is, you have to check that:

- The DNI has 8 digits and a capital letter that is not an `I Ñ O U`.

- The NIE has an initial letter `X, `Y` or `Z` followed by 7 digits, and a final letter that is not an `I Ñ O U`.

**Use these correct DNI test cases (*test them*)**:
~~~
"78484464T", "72376173A", "01817200Q", "95882054E", "63587725Q",
"26861694V", "21616083Q", "26868974Y", "40135330P", "89044648X",
~~~
1. Generate 10 incorrect DNI test cases and test them.

2. Generate 10 correct NIE test cases and test them.

3. Generate 10 incorrect NIE test cases and test them.
