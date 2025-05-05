package com.frr244.toggleaction;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.ToggleAction;
import com.intellij.openapi.project.DumbAware;
import org.jetbrains.annotations.NotNull;

public class ExampleMenuAction extends ToggleAction implements DumbAware {

    protected boolean selected = false;

    public ExampleMenuAction() {
        super("Some Toggle", "A very fancy description", AllIcons.Toolwindows.ToolWindowChanges);
    }

    @Override
    public boolean isSelected(@NotNull AnActionEvent anActionEvent) {
        return selected;
    }

    @Override
    public void setSelected(@NotNull AnActionEvent anActionEvent, boolean b) {
        selected = b;
    }
}