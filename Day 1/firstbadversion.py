def isBadVersion(n):
    if n == 2:
        return False
    return True


''' isBadVersion in imitating an API call here, just for testing purpose '''


class Solution:

    def firstBadVersion(self, n):
        """
        :type n: int
        :rtype: int
        """
        highest = 0
        lo = 1
        hi = n
        while lo <= hi:
            mid = lo + (hi - lo)//2
            bad = isBadVersion(mid)
            if bad is True:
                hi = mid - 1
            else:
                lo = mid + 1
                highest = max(highest, mid)
        return highest + 1


if __name__ == "__main__":
    s = Solution()
    ans = s.firstBadVersion(4)
    print(ans)
