# Chess Game in Java ♟️

A chess game project written in Java featuring PvP and PvE gameplay, move validation, chess rules implementation, and user data storage.

---

# Project Goals

The goal of this project is to create a complete chess application that supports:
- Player vs Player (PvP),
- Player vs Environment / AI (PvE),
- Full chess rules implementation,
- Move validation
---

# Features

## 1. PvE Mode (Player vs Environment)

Implementation of an AI opponent using:
- Alpha-Beta Pruning
- Position evaluation heuristics

### Possible Heuristics

The AI may evaluate positions based on:

- piece values:
  - pawn = 1
  - knight/bishop = 3
  - rook = 5
  - queen = 9
- center control,
- piece mobility,
- king safety,
- material advantage,
- piece activity.

---

## 2. Rules System & Move Validation

The rules engine is responsible for:

- generating legal moves,
- validating moves,
- detecting:
  - check,
  - checkmate,
  - stalemate,
- handling:
  - castling,
  - en passant,
  - pawn promotion.

### Validation Includes

- correct movement according to piece type,
- preventing illegal moves that expose the king,
- collision detection,
- turn management.

---

## 3. PvP Mode

Possible implementations:

### Local PvP

- two players on the same computer.

### Online PvP

Communication based on:

- TCP/IP sockets,
- client-server architecture.
---

# Technologies

Possible technologies used in the project:

- Java 17+
- JavaFX or Swing (GUI)
- TCP/IP Sockets
- SQLite / JDBC
- Maven or Gradle

---

---

# Possible Future Features

- user database
- GUI

---


# Project Status

 Currently in development.
---
