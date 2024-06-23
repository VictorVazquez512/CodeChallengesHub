# List of file names
$fileNames = @(
    "3.Repetitions.cpp",
    "4.IncreasingArray.cpp",
    "5.Permutations.cpp",
    "6.NumberSpiral.cpp",
    "7.TwoKnights.cpp",
    "8.TwoSets.cpp",
    "9.BitStrings.cpp",
    "10.TrailingZeros.cpp",
    "11.CoinPiles.cpp",
    "12.PalindromeReorder.cpp",
    "13.GrayCode.cpp",
    "14.TowerofHanoi.cpp",
    "15.CreatingStrings.cpp",
    "16.AppleDivision.cpp",
    "17.ChessboardandQueens.cpp",
    "18.DigitQueries.cpp",
    "19.GridPaths.cpp"
    # Add more file names as needed
)

# Iterate through each file name and create the file
foreach ($fileName in $fileNames) {
    New-Item -Path $fileName -ItemType File -Force
}
