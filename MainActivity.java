package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import static java.lang.Math.*;

public class MainActivity extends AppCompatActivity {
    TextView tv1, tv2;
    double c, d, r;
    Integer b;
    String a;
    String aa;
    String s;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, b00, bc, ba, bs, bx, bd, bpw, sqt, bpt, be;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.Textview1);
        tv2 = findViewById(R.id.Textview2);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        b00 = findViewById(R.id.b00);
        bc = findViewById(R.id.bc);
        ba = findViewById(R.id.ba);
        bs = findViewById(R.id.bs);
        bx = findViewById(R.id.bx);
        bd = findViewById(R.id.bd);
        bpw = findViewById(R.id.bpw);
        sqt = findViewById(R.id.sqt);
        bpt = findViewById(R.id.bpt);
        be = findViewById(R.id.be);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                a = tv1.getText().toString();
                a = a + "1";
                tv1.setText(a);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "2";
                tv1.setText(a);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "3";
                tv1.setText(a);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "4";
                tv1.setText(a);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "5";
                tv1.setText(a);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "6";
                tv1.setText(a);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "7";
                tv1.setText(a);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "8";
                tv1.setText(a);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "9";
                tv1.setText(a);
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "0";
                tv1.setText(a);
            }
        });
        b00.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "00";
                tv1.setText(a);
            }
        });
        bpt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                    a = tv1.getText().toString();
                    a = a + ".";
                    tv1.setText(a);
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv1.setText("");
                tv2.setText("");
            }
        });

        ba.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aa = a;
                b = 1;
                a = "";
                tv1.setText("+");
            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aa = a;
                b = 2;
                a = "";
                tv1.setText("-");
                tv1.setText("");
            }
        });
        bx.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aa = a;
                b = 3;
                a = "";
                tv1.setText("*");
                tv1.setText("");
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aa = a;
                b = 4;
                a = "";
                tv1.setText("/");
                tv1.setText("");
            }
        });
        sqt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aa = a;
                b = 5;
                a = "";
                tv1.setText("√");
            }
        });
        bpw.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aa = a;
                b = 6;
                a = "";
                tv1.setText("^");
                tv1.setText("");
            }
        });

        //Logic for calculations
        //OnClickEvent handling for =
            be.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (b == 1) {
                        c = Double.parseDouble(aa);
                        d = Double.parseDouble(a);
                        r = c + d;
                    } else if (b == 4) {
                        c = Double.parseDouble(aa);
                        d = Double.parseDouble(a);
                        r = c / d;
                    } else if (b == 2) {
                        c = Double.parseDouble(aa);
                        d = Double.parseDouble(a);
                        r = c - d;
                    } else if (b == 3) {
                        c = Double.parseDouble(aa);
                        d = Double.parseDouble(a);
                        r = c * d;
                    } else if (b == 5) {
                        c = Double.parseDouble(aa);
                        d = Double.parseDouble(a);
                        r = sqrt(c);
                    } else if (b == 6) {
                        c = Double.parseDouble(aa);
                        d = Double.parseDouble(a);
                        r = pow(c, d);
                    }
                    else{
                        c=Double.parseDouble(aa);
                        r = c;
                    }

                    String op = "";
                    switch (b) {
                        case 1:
                            op = " + ";
                            break;
                        case 2:
                            op = " - ";
                            break;
                        case 3:
                            op = " x ";
                            break;
                        case 4:
                            op = " / ";
                            break;
                        case 5:
                            op = " √ ";
                            break;
                        case 6:
                            op = " ^ ";
                            break;
                    }

        // To display the result
                    if (d == 0 & b == 4) {
                        s = "Cannot be divided by 0";
                        tv1.setText(c + op + d);
                        tv2.setText(s);
                    }
                    else if (d == 5) {
                        tv1.setText(op + c);
                        tv2.setText(" " + r);}
                    else {
                        tv1.setText(c + op + d);
                        tv2.setText(" " + r);
                    }
                }
            });

    }
}
