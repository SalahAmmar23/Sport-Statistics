
---

# Sport Statistics

This project reads game data from a file, processes team statistics, and outputs a specific team's number of games, wins, and losses.

## 📄 Description

The program prompts the user for:

1. **A file name** containing match results.
2. **A team name** to analyze.

It then:

- Parses the file line by line, reading game results.
- Stores each match in a `Team` object inside an `ArrayList`.
- Calculates:
  - Total games played by the given team.
  - Number of wins.
  - Number of losses.

Finally, it prints these statistics.

## 📂 Input File Format

Each line in the input file must follow the format:

```
HomeTeam,VisitingTeam,HomePoints,VisitingPoints
```

Example:

```
ENCE,Vitality,9,16
ENCE,Vitality,16,12
FURIA,NRG,7,16
```

## 🏛️ Project Structure

### `SportStatistics` (Main Class)

- **Reads input**: Asks for filename and team name via the console.
- **Reads file**: Uses `Scanner` and `Paths.get(filename)` to load the file.
- **Parses file**: Each non-empty line is split into home team, visiting team, and their points.
- **Stores matches**: Creates `Team` objects and stores them in an `ArrayList`.
- **Calculates statistics**:
  - **Games played**: Number of matches involving the given team.
  - **Wins**: Matches the team won.
  - **Losses**: Matches the team lost.
- **Outputs**: Displays games played, wins, and losses.

### `Team` (Helper Class)

- **Attributes**:
  - `homeTeam`
  - `visitingTeam`
  - `homeTeamPoints`
  - `visitingTeamPoints`
  
- **Key Methods**:
  - `hasTeam(String name)`: Checks if a team participated in the match.
  - `homeWinner()`: Checks if the home team won.
  - `visitorWinner()`: Checks if the visiting team won.
  - `didWin(String name)`: Checks if a specific team won.
  - `didLose(String name)`: Checks if a specific team lost.
  - `toString()`: Returns a simple description of the match (home vs visiting team).

## ⚙️ Example Run

```
File:
matches.txt
Team:
ENCE
Games: 6
Wins: 2
Losses: 4
```

## ⚠️ Error Handling

- If the file cannot be found or opened, an error message is printed.

---

