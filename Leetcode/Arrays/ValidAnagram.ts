// Sorting Approach
function isAnagram(s: string, t: string): boolean {
  const sortedS = s.split("").sort().join("");
  const sortedT = t.split("").sort().join("");

  return sortedS === sortedT;
}

// Hash Map Approach
function isAnagram(s: string, t: string): boolean {
  if (s.length !== t.length) return false;

  const map = new Map();

  for (let i = 0; i < s.length; i++) {
    map.set(s[i], (map.get(s[i]) || 0) + 1);
    map.set(t[i], (map.get(t[i]) || 0) - 1);
  }

  for (let [key, value] of map) {
    if (value !== 0) return false;
  }

  return true;
}
