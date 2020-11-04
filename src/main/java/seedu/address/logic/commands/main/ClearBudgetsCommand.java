package seedu.address.logic.commands.main;

import static java.util.Objects.requireNonNull;

import seedu.address.logic.commands.Command;
import seedu.address.logic.commands.CommandResult;
import seedu.address.model.Model;

public class ClearBudgetsCommand extends Command {
    public static final String COMMAND_WORD = "clear";
    public static final String SYNTAX = COMMAND_WORD;
    public static final String DESCRIPTION = "Deletes all budgets.";
    public static final String MESSAGE_USAGE = COMMAND_WORD + ":\n"
            + "Usage: " + SYNTAX + "\n"
            + "Description: " + DESCRIPTION + "\n";


    public static final String MESSAGE_DELETE_BUDGET_SUCCESS = "Cleared all budgets.";

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.deleteAllBudgets();
        model.saveToHistory();
        return new CommandResult(MESSAGE_DELETE_BUDGET_SUCCESS);
    }
}
