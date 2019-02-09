package org.pursuit.testing_revisited_creating_tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.pursuit.testing_revisited_creating_tests.translator.SillyTranslator;

public class SillyTranslatorUnitTest {

    @Before
    public void setup() {

    }

    @After
    public void breakDown() {

    }


    @Test
    public void checkDoubleTalk() {
        //Given
        String testString = "pursuit";
        //When
        String result = SillyTranslator.getInstance().doubleTalk(testString);
        //Then
        Assert.assertEquals(result, "Pursuit pursuit");
    }

    @Test
    public void checkReverse() {
        String testString = "pursuit";
        String expectedResult = "tuisrup";
        //

        SillyTranslator.getInstance().reverse(testString);

        Assert.assertEquals("", expectedResult);
    }

    @Test
    public void checkDoubleTalkWithNullInput() {
        //Given
        String testString = null;
        String expectedResult = "";
        //When
        String result = SillyTranslator.getInstance().doubleTalk(testString);
        //Then
        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void checkDoubleTalkWithNumbers() {
        //Given
        String testString = "1234";
        String expectedResult = "1234 1234";
        //When
        String result = SillyTranslator.getInstance().doubleTalk(testString);
        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDoubleTalkWithEmptyString() {
        String testString = "";
        String expectedResult = "";

        String result = SillyTranslator.getInstance().doubleTalk(testString);
        Assert.assertEquals(expectedResult, result);

    }

    @Test
    public void checkSnakeSpeakWithNumbers() {
        String testString = "1234";
        String expectedResult = "1234";

        String result = SillyTranslator.getInstance().snakeSpeak(testString);

        Assert.assertEquals(expectedResult, result);

    }


    @Test
    public void checkSnakeSpeakIsNull() {
        String testString = null;
        String expectedResult = "";

        String result = SillyTranslator.getInstance().snakeSpeak(testString);

        Assert.assertEquals(expectedResult, result);

    }

    @Test
    public void checkSnakeSpeakWithCapital() {
        String testString = "Snake";
        String expectedResult = "Snake";

        String result = SillyTranslator.getInstance().snakeSpeak(testString);

        Assert.assertEquals(expectedResult, result);

    }


    @Test
    public void checkSnakeSpeakWithCapsafterS() {
        String testString = "sNAKE";
        String expectedResult = "sssssnake";

        String result = SillyTranslator.getInstance().snakeSpeak(testString);

        Assert.assertEquals(expectedResult, result);

    }

    @Test
    public void checkSnakeSpeakWithEmptyString() {
        String testString = "";
        String expectedResult = "";

        String result = SillyTranslator.getInstance().snakeSpeak(testString);

        Assert.assertEquals(expectedResult, result);


    }


    @Test
    public void checkSnakeSpeak() {
        String testString = "super";
        String expectedResult = "sssssuper";

        String result = SillyTranslator.getInstance().snakeSpeak(testString);

        Assert.assertEquals(expectedResult, result);

    }

    @Test
    public void checkSnakeSpeakWithDifferentChars() {
        String testString = "able";
        String expectedResult = "able";

        String result = SillyTranslator.getInstance().snakeSpeak(testString);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypher() {
        String testString = "ace";
        String expectedResult = "bdf";

        String result = SillyTranslator.getInstance().caesarCypher(testString);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypherWithCaps() {
        String testString = "ACE";
        String expectedResult = "BDF";

        String result = SillyTranslator.getInstance().caesarCypher(testString);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypherWithNumbers() {
        String testString = "123";
        String expectedResult = "234";

        String result = SillyTranslator.getInstance().caesarCypher(testString);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypherWithSpecialChars() {
        String testString = "abc!";
        String expectedResult = "bcd\"";

        String result = SillyTranslator.getInstance().caesarCypher(testString);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypherWithEmpty() {
        String testString = "";
        String expectedResult = "";

        String result = SillyTranslator.getInstance().caesarCypher(testString);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkpigLatinWithNonVowel() {
        String testString = "hhhhhhhhh";
        String expectedResult = "";

        String result = SillyTranslator.getInstance().pigLatin(testString);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkpigLatinWayCase() {
        String testString = "a";
        String expectedResult = "away";

        String result = SillyTranslator.getInstance().pigLatin(testString);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkpigLatinWIthoutVowels() {
        String testString = "w";
        String expectedResult = "";

        String result = SillyTranslator.getInstance().pigLatin(testString);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkpigLatinWayCase2() {
        String testString = "able";
        String expectedResult = "ableway";

        String result = SillyTranslator.getInstance().pigLatin(testString);

        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void checkpigLatinAyCase() {
        String testString = "mole";
        String expectedResult = "olemay";

        String result = SillyTranslator.getInstance().pigLatin(testString);

        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void checkpigLatinAyCase2() {
        String testString = "ritter";
        String expectedResult = "itterray";

        String result = SillyTranslator.getInstance().pigLatin(testString);

        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void checkpigLatinWithNumbers() {
        String testString = "1234";
        String expectedResult = "";

        String result = SillyTranslator.getInstance().pigLatin(testString);

        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void checkpigLatinwithCaps() {
        String testString = "A";
        String expectedResult = "Away";

        String result = SillyTranslator.getInstance().pigLatin(testString);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkpigLatinWithSpecialCharacter() {
        String testString = "a!ÆÎ";
        String expectedResult = "a!ÆÎway";

        String result = SillyTranslator.getInstance().pigLatin(testString);

        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void checkSarcasticRebuttalWithEmptyString() {
        String testString = "";
        String expectedResult = "";

        String result = SillyTranslator.getInstance().sarcasticRebuttal(testString);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSarcasticRebuttal() {
        String testString = "money";
        String expectedResult = "money shmoney";

        String result = SillyTranslator.getInstance().sarcasticRebuttal(testString);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSarcasticRebuttalWithSecondCAse() {
        String testString = "sunny";
        String expectedResult = "sunny shmunny";

        String result = SillyTranslator.getInstance().sarcasticRebuttal(testString);

        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void checkElideWithFirstCase() {
        String testString = "table";
        String expectedResult = "table";

        String result = SillyTranslator.getInstance().elide(testString);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkElideWithSecondCase() {
        String testString = "tables!";
        String expectedResult = "tab...";

        String result = SillyTranslator.getInstance().elide(testString);

        Assert.assertEquals(expectedResult, result);
    }





    @Test
    public void checkSillyCaseWithLowerCase() {
        String testString = "able";
        String expectedResult = "AbLe";

        String result = SillyTranslator.getInstance().sillyCase(testString);

        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void checkSillyCaseWithCapitalCase() {
        String testString = "ABLE";
        String expectedResult = "AbLe";

        String result = SillyTranslator.getInstance().sillyCase(testString);

        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void checkDevowelToLowerCase() {
        String testString = "ABLE";
        String expectedResult = "bl";

        String result = SillyTranslator.getInstance().deVowel(testString);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDevowel() {
        String testString = "able";
        String expectedResult = "bl";

        String result = SillyTranslator.getInstance().deVowel(testString);

        Assert.assertEquals(expectedResult, result);
    }



    @Test
    public void checkDeConsonant() {
        String testString = "able";
        String expectedResult = "ae";

        String result = SillyTranslator.getInstance().deConsonant(testString);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDeConsonantWithNumbers() {
        String testString = "able1234";
        String expectedResult = "ae";

        String result = SillyTranslator.getInstance().deConsonant(testString);

        Assert.assertEquals(expectedResult, result);
    }



    @Test
    public void checkDeConsonantWithEmptyString() {
        String testString = "";
        String expectedResult = "";

        String result = SillyTranslator.getInstance().deConsonant(testString);

        Assert.assertEquals(expectedResult, result);
    }






}
