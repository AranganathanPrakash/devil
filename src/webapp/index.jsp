<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Simple Calculator</title>
</head>
<body>
    <h1>Simple Calculator</h1>
    <form action="calculator" method="get">
        <label for="num1">Number 1:</label>
        <input type="number" id="num1" name="num1" required>
        <br><br>
        <label for="num2">Number 2:</label>
        <input type="number" id="num2" name="num2" required>
        <br><br>
        <label for="operation">Operation:</label>
        <select name="operation" id="operation" required>
            <option value="add">Add</option>
            <option value="subtract">Subtract</option>
            <option value="multiply">Multiply</option>
            <option value="divide">Divide</option>
        </select>
        <br><br>
        <input type="submit" value="Calculate">
    </form>
</body>
</html>

