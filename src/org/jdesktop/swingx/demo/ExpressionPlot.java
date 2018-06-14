/*
 * ExpressionPlot.java
 *
 * Created on 16 mars 2006, 15:44
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.jdesktop.swingx.demo;

import org.jdesktop.swingx.JXGraph;
import org.nfunk.jep.JEP;

/**
 *
 * @author gfx
 */
class ExpressionPlot extends JXGraph.Plot {
    private final String expression;
    private final  JEP parser;
    
    public ExpressionPlot(String expression) {
        this.expression = expression;
        
        parser = new JEP();
        parser.addStandardConstants();
        parser.addStandardFunctions();
    }

    public double compute(double value) {
        parser.addVariable("x", value);
        parser.parseExpression(expression);
        return parser.getValue();
    }
}
