# Environment Setup Instructions

## Mini Mac
To create and activate the environment on your Mini Mac (using an external drive), follow these steps:

1. Open a terminal.
2. Navigate to the external drive where you want to create the environment:
   ```
   cd /Volumes/family-backup/wd-liyam/python
   ```
3. Create a virtual environment:
   ```
   python3 -m venv my_env_venv
   ```
4. Activate the environment:
   ```
   source /Volumes/family-backup/wd-liyam/python/my_env_venv/bin/activate
   ```

## Using the Environment in VS Code
1. Open VS Code.
2. Open the Command Palette (F1 or Ctrl+Shift+P).
3. Type `Python: Select Interpreter` and select it.
4. Choose the interpreter from the list that corresponds to your environment:
   - For Mini Mac: `/Volumes/family-backup/wd-liyam/python/my_env_venv/bin/python`
5. Open a terminal in VS Code (Ctrl+`).
6. Activate the environment in the terminal:
   - For Mini Mac:
     ```
     source /Volumes/family-backup/wd-liyam/python/my_env_venv/bin/activate
     ```

Now you can run your Python scripts within the activated environment in VS Code.