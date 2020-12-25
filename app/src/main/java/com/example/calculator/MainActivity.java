package com.example.calculator;

/*Last modified: 12/25/2020
  @author Dominika Bobik
 * Calculator Android App
 */


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.mariuszgromada.math.mxparser.Expression;
//http://mathparser.org/api/org/mariuszgromada/math/mxparser/Expression.html
//https://github.com/mariuszgromada/MathParser.org-mXparser/blob/master/CURRENT/java/src/org/mariuszgromada/math/mxparser/Expression.java

public class MainActivity extends AppCompatActivity {

    //Full equation stored as string
    private String equation = "";
    boolean negative = false;

    //Object declaration, so they can be used in methods
    Button addB, divideB, multiplyB, subtractB, equalB, deleteB, parenthesisStartB, parenthesisEndB, clearB, powerB, sqrtB;
    Button oneB, twoB, threeB, fourB, fiveB, sixB, sevenB, eightB, nineB, zeroB;
    private TextView equationT, resultT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button objects initialization
        //Actions
        addB = findViewById(R.id.b_add);
        divideB = findViewById(R.id.b_divide);
        multiplyB = findViewById(R.id.b_multiply);
        subtractB = findViewById(R.id.b_minus);
        powerB = findViewById(R.id.powerB);
        sqrtB = findViewById(R.id.b_sqrt);
        equalB = findViewById(R.id.b_equals);
        deleteB = findViewById(R.id.b_delete);
        clearB = findViewById(R.id.clearB);
        parenthesisEndB = findViewById(R.id.parenthesisEndB);
        parenthesisStartB = findViewById(R.id.parenthesisStartB);

        //Numbers
        oneB = findViewById(R.id.b_one);
        twoB = findViewById(R.id.b_two);
        threeB = findViewById(R.id.b_three);
        fourB = findViewById(R.id.b_four);
        fiveB = findViewById(R.id.b_five);
        sixB = findViewById(R.id.b_six);
        sevenB = findViewById(R.id.b_seven);
        eightB = findViewById(R.id.b_eight);
        nineB = findViewById(R.id.b_nine);
        zeroB = findViewById(R.id.b_zero);

        //Text objects
        equationT = findViewById(R.id.equationT);
        resultT = findViewById(R.id.resultT);

    }

    //OnClick methods for numbers
    public void oneButton(View v) {
        equation += "1";
        if (equation.length() > 40) {
            equationT.setText(equation.substring(0, 39));
        } else {
            equationT.setText(equation);
        }
    }

    public void twoButton(View v) {
        equation = equation + "2";
        if (equation.length() > 40) {
            equationT.setText(equation.substring(0, 39));
        } else {
            equationT.setText(equation);
        }
    }

    public void threeButton(View v) {
        equation = equation + "3";
        if (equation.length() > 40) {
            equationT.setText(equation.substring(0, 39));
        } else {
            equationT.setText(equation);
        }
    }

    public void fourButton(View v) {
        equation = equation + "4";
        if (equation.length() > 40) {
            equationT.setText(equation.substring(0, 39));
        } else {
            equationT.setText(equation);
        }
    }

    public void fiveButton(View v) {
        equation = equation + "5";
        if (equation.length() > 40) {
            equationT.setText(equation.substring(0, 39));
        } else {
            equationT.setText(equation);
        }

    }

    public void sixButton(View v) {
        equation = equation + "6";
        if (equation.length() > 40) {
            equationT.setText(equation.substring(0, 39));
        } else {
            equationT.setText(equation);
        }

    }

    public void sevenButton(View v) {
        equation = equation + "7";
        if (equation.length() > 40) {
            equationT.setText(equation.substring(0, 39));
        } else {
            equationT.setText(equation);
        }

    }

    public void eightButton(View v) {
        equation = equation + "8";
        if (equation.length() > 40) {
            equationT.setText(equation.substring(0, 39));
        } else {
            equationT.setText(equation);
        }
    }

    public void nineButton(View v) {
        equation = equation + "9";
        if (equation.length() > 40) {
            equationT.setText(equation.substring(0, 39));
        } else {
            equationT.setText(equation);
        }
    }

    public void zeroButton(View v) {
        equation = equation + "0";
        if (equation.length() > 40) {
            equationT.setText(equation.substring(0, 39));
        } else {
            equationT.setText(equation);
        }
    }

    //onClick methods for operators
    public void addButton(View v) {
        equation += "+";
        if (equation.length() > 40) {
            equationT.setText(equation.substring(0, 39));
        } else {
            equationT.setText(equation);
        }
    }

    public void subtractButton(View v) {
        equation += "-";
        if (equation.length() > 40) {
            equationT.setText(equation.substring(0, 39));
        } else {
            equationT.setText(equation);
        }
    }

    public void multiplyButton(View v) {
        equation += "*";
        if (equation.length() > 40) {
            equationT.setText(equation.substring(0, 39));
        } else {
            equationT.setText(equation);
        }
    }

    public void divideButton(View v) {
        equation += "/";
        if (equation.length() > 40) {
            equationT.setText(equation.substring(0, 39));
        } else {
            equationT.setText(equation);
        }
    }

    public void powerButton(View v) {
        equation += "^";
        if (equation.length() > 40) {
            equationT.setText(equation.substring(0, 39));
        } else {
            equationT.setText(equation);
        }
    }

    public void scientificNotationButton(View v) {
        equation += "E";
        if (equation.length() > 40) {
            equationT.setText(equation.substring(0, 39));
        } else {
            equationT.setText(equation);
        }
    }

    public void factorialButton(View v) {
        equation += "!";
        if (equation.length() > 40) {
            equationT.setText(equation.substring(0, 39));
        } else {
            equationT.setText(equation);
        }
    }

    //Logarithms

    public void sqrtButton(View v) {
        function("sqrt(");
    }

    public void lnButton(View v) {
        function("ln(");
    }

    public void logButton(View v) {
        function("log(");
    }

    //Trig functions
    public void sinButton(View v) {
        function("sin(");
    }

    public void cosButton(View v) {
        function("cos(");
    }

    public void tanButton(View v) {
        function("tan(");
    }

    //onClick methods for other buttons
    public void clearButton(View v) {
        equation = "";
        equationT.setText("");
        resultT.setText("");
    }

    public void deleteButton(View v) {
        if (equation.length() == 0) {
            equation = "";
        } else {
            equation = equation.substring(0, equation.length() - 1);
            equationT.setText(equation);
        }
    }

    public void dotButton(View v) {
        equation += ".";
        if (equation.length() > 40) {
            equationT.setText(equation.substring(0, 39));
        } else {
            equationT.setText(equation);
        }
    }

    public void negativeButton(View v) {
        if (negative==false) {
            if (equation.length() == 0) {
                equation = "-";
            } else {
                for (int i = equation.length() - 1; i >= 0; i--) {
                    char ch = equation.charAt(i);
                    if (i == 0) {
                        equation = "-" + equation;
                    } else if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
                        String equation1 = equation.substring(0, i + 1);
                        String equation2 = equation.substring(i + 1);
                        equation = equation1 + "-" + equation2;
                        break;
                    }
                }
            }
            negative = true;
        }

        else {
            for (int i = equation.length() - 1; i >= 0; i--) {
                char ch = equation.charAt(i);
                if (ch == '-' && i != 0) {
                    String equation1 = equation.substring(0, i);
                    String equation2 = equation.substring(i + 1);
                    equation = equation1 + equation2;
                    break;
                }
                else if (ch == '-' && i == 0){
                    equation = equation.substring(1);
                }
            }
            negative = false;
        }

        if (equation.length() > 40) {
            equationT.setText(equation.substring(0, 39));
        } else {
            equationT.setText(equation);
        }
    }


    public void parenthesisStartButton(View v) {
        equation += "(";
        if (equation.length() > 40) {
            equationT.setText(equation.substring(0, 39));
        } else {
            equationT.setText(equation);
        }
    }

    public void parenthesisEndButton(View v) {
        equation += ")";
        if (equation.length() > 40) {
            equationT.setText(equation.substring(0, 39));
        } else {
            equationT.setText(equation);
        }
    }

    //Equals button, which yields result
    @SuppressLint("SetTextI18n")
    public void equalsButton(View v) {
        //Equation is evaluated using Expression class
        Expression expression = new Expression(equation);
        double result = expression.calculate();
        String resultText = Double.toString(result);
        if (resultText.charAt(resultText.length() - 1) == '0') {
            resultText = resultText.substring(0, resultText.length() - 2);
        }
        resultT.setText(resultText);
        negative = false;
    }

    //Method for all the functions supported
    public void function(String functionName) {
        if (equation.length() == 0) {
            equation = functionName;
        } else {
            for (int i = equation.length() - 1; i >= 0; i--) {
                char ch = equation.charAt(i);
                if (i == 0) {
                    equation = functionName + equation;
                } else if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
                    String equation1 = equation.substring(0, i + 1);
                    String equation2 = equation.substring(i + 1);
                    equation = equation1 + functionName + equation2;
                    break;
                }
            }
        }
        if (equation.length() > 40) {
            equationT.setText(equation.substring(0, 39));
        } else {
            equationT.setText(equation);
        }
    }

}