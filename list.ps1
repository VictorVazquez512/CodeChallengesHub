# List of file names
$fileNames = @(
    "1.DistinctNumbers.cpp",
    "2.PlayinginaCasino.cpp",
    "3.Kayaking.cpp",
    "4.WhyDidtheCowCrosstheRoadIII.cpp",
    "5.CowCollege.cpp",
    "6.AngryCows.cpp",
    "7.Permutator.cpp"
    # Add more file names as needed
)

# Iterate through each file name and create the file
foreach ($fileName in $fileNames) {
    New-Item -Path $fileName -ItemType File -Force
}
