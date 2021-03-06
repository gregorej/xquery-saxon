package org.xquery.saxon.coverage.collect;

import org.xquery.saxon.coverage.trace.CoverageInstruction;

public class InstructionCollector {
    private final CoverageInstruction instruction;
    private boolean instructionInvoked;

    public InstructionCollector(CoverageInstruction instruction) {
        this.instruction = instruction;
    }

    public void instructionInvoked() {
        instructionInvoked = true;
    }

    public boolean isInstructionInvoked() {
        return instructionInvoked;
    }

    public String getInstruction() {
        return instruction.toString();
    }
}
