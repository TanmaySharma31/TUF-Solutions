# [1049. Painter's Partition](https://takeuforward.org/practice/dsa/painters-partition?sidebar=0)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

You are given **A** painters and an array **C** of **N** integers where **C[i]** denotes the length of the **i** ^ **th** board. Each painter takes **B** units of time to paint 1 unit of board. You must assign boards to painters such that:

- Each painter paints only **contiguous** segments of boards.
- No board can be **split between painters** .
- The goal is to **minimize** the **time** to paint all boards.

Return the minimum time required to paint all boards **modulo 10000003** .

### Example 1:

**Input:** A = 2, B = 5, C = [1, 10]

**Output:** 50

**Explanation:**

- Painter 1 paints board 0 (length = 1), time = 5
- Painter 2 paints board 1 (length = 10), time = 50
- Max time = 50
- Return 50 % 10000003 = 50

### Example 2:

**Input:** A = 10, B = 1, C = [1, 8, 11, 3]

**Output:** 11

**Explanation:**

- Assign each board to a different painter
- Max time = max(1, 8, 11, 3) = 11
- Return 11 % 10000003 = 11

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= A <= 1000
- 1 <= B <= 10^6
- 1 <= N <= 10^5
- 1 <= C[i] <= 10^6

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
