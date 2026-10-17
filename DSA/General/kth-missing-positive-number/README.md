# [367. Kth Missing Positive Number](https://takeuforward.org/practice/dsa/kth-missing-positive-number?discussion_id=734)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Given a sorted array of unique positive integers **arr** , your task is to return the **kᵗʰ** missing positive number that is not present in arr.

The array is guaranteed to be **strictly increasing** , and the missing numbers are those positive integers that do not appear in **arr** but would appear in a full sequence starting from 1.

### Example 1:

**Input:** arr = [3, 5, 7, 10], k = 6

**Output: 9**

**Explanation:**

The missing numbers are [1, 2, 4, 6, 8, 9, 11, ...]. The 6ᵗʰ missing number is 9.

### Example 2:

**Input:** arr = [1, 4, 6, 8, 9], k = 3

**Output:** 5

**Explanation:**

The missing numbers are [2, 3, 5, 7, 10, ...]. The 3ʳᵈ missing number is 5.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= arr.length <= 1000
- 1 <= arr[i] <= 1000
- 1 <= k <= 1000
- arr[i] < arr[j] for all 1 <= i < j <= arr.length

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
