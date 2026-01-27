package com.ciberedu.Week05_Interfaces.Day05_Practice;

public class VoiceRecorder implements Recordable, Pausable {

    @Override
    public void pause() {
        System.out.println("Pausing record");
    }

    @Override
    public void record() {
        System.out.println("Recording voice...");
    }

    @Override
    public void reset() {
        Recordable.super.reset();
    }
}
