package hashDouble;

public class HashTable {
	private DataItem[] hashArray; // array holds hash table
	private int arraySize;
	private DataItem nonItem; // for deleted items

	public HashTable(int size) // constructor
	{
		arraySize = size;
		hashArray = new DataItem[arraySize];
		nonItem = new DataItem(-1); // deleted item key is -1
	}

	public void displayTable() {
		System.out.print("Table: ");
		for (int j = 0; j < arraySize; j++) {
			if (hashArray[j] != null)
				System.out.print(hashArray[j].getKey() + " ");
			else
				System.out.print("** ");
		}
		System.out.println("");
	}

	public int hashFunc1(int key) {
		return key % arraySize; // hash function
	}

	public int hashFunc2(int key) {
		return 5 - key % 5; // hash function
	}

	public void insert(int key, DataItem item) {
		int hashVal = hashFunc1(key); // hash the key
		int stepSize = hashFunc2(key); // get step size
										// until empty cell or -1
		while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
			hashVal += stepSize; // add the step
			hashVal %= arraySize; // for wraparound
		}
		hashArray[hashVal] = item; // insert item
	}

	public DataItem delete(int key) // delete a DataItem
	{
		int hashVal = hashFunc1(key); // hash the key
		int stepSize = hashFunc2(key); // get step size

		while (hashArray[hashVal] != null) // until empty cell,
		{ // is correct hashVal?
			if (hashArray[hashVal].getKey() == key) {
				DataItem temp = hashArray[hashVal]; // save item
				hashArray[hashVal] = nonItem; // delete item
				return temp; // return item
			}
			hashVal += stepSize; // add the step
			hashVal %= arraySize; // for wraparound
		}
		return null; // can't find item
	} // end delete()

	public DataItem find(int key) // find item with key
	{
		int hashVal = hashFunc1(key); // hash the key
		int stepSize = hashFunc2(key);
		
		while (hashArray[hashVal] != null) // until empty cell,
		{ // found the key?
			if (hashArray[hashVal].getKey() == key)
				return hashArray[hashVal]; // yes, return item
			hashVal += stepSize;
			hashVal %= arraySize; // wraparound if necessary
		}
		return null; // can't find item
	}
}
