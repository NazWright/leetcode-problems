# Roman To Int

## Pseudocode

**class** RomanToIntSolution

    CONSTANT romanNumeralsMap A key value pairing of roman numerals character to their numerical value

    METHOD romanToInt(romanNumeral), RETURNING romanNumeralValue - the integer value of the roman numeral
        VARIABLE sum <- 0
        CALL addRomanNums(romanNumeralsMap), RETURNING void
        FOREACH character - character in the roman numeral s
            CALL getIntegertValueOfRomanNumerals(character), RETURNING romanNumeralIntVal
            sum <- ADD sum + romanNumeralIntVal
        END FOREACH
        RETURN sum
    END


    METHOD getIntegerValueOfRomanNumeral(romanNumeral), RETURNING romanNumeralIntVal
        romanNumCharacter <- CALL Character.valueOf(romanNumeral)
        IF romanNumeralsMap has a key that matches the value of romanNumeral
            RETURN the value that corresponds to the matching key
        ELSE
            RETURN 0
        END IF
    END

    METHOD addRomanNums(romanNumerals - a key-value pairing of roman numerals), RETURNING void
        PUT romanNumerals <- key: I, value: 1
        PUT romanNumerals <- key: I, value: 10
        PUT romanNumerals <- key: I, value: 50
        PUT romanNumerals <- key: I, value: 100
        PUT romanNumerals <- key: I, value: 500
        PUT romanNumerals <- key: I, value: 1000
    END

    METHOD main
        VARIABLE romanNumeralUtils - an instance of the solution class to test implementation
        CALL romanToInt() FROM romanNumeralUtils WITH "I"
        valueOfRomanNumeralI <- romanToInt("I")
        PRINT valueOfRomanNumeralI
    END

**end class**
