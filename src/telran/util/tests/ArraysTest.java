package telran.util.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static telran.util.ArraysInt.*;

import java.util.Arrays;

class ArraysTest {
	int[] array = { 10, 25, 30, 40, 100 };

	@Test
	void addNumberTest() {
		int[] arrayExpextected = { 10, 25, 30, 40, 100, -2 };
		int[] arrayActual = addNumber(array, -2);
		assertArrayEquals(arrayExpextected, arrayActual);
	}

	@Test
	void insertNumberTest() {
		int[] arrayExpectedLast = { 10, 25, 30, 40, 100, 25 };
		int[] arrayExpectedFirst = { 25, 10, 25, 30, 40, 100 };
		int[] arrayExpectedMIddle = { 10, 25, 30, 25, 40, 100 };
		int[] arrayActualLast = insertNumber(array, 5, 25);
		int[] arrayActualFirst = insertNumber(array, 0, 25);
		int[] arrayActualMiddle = insertNumber(array, 3, 25);
		assertArrayEquals(arrayExpectedLast, arrayActualLast);
		assertArrayEquals(arrayExpectedFirst, arrayActualFirst);
		assertArrayEquals(arrayExpectedMIddle, arrayActualMiddle);
	}

	@Test
	void removeNumberTest() {
		int[] arrayExpectedLast = { 10, 25, 30, 40 };
		int[] arrayExpectedFirst = { 25, 30, 40, 100 };
		int[] arrayExpectedMIddle = { 10, 25, 40, 100 };
		int[] arrayActualLast = removeNumber(array, array.length - 1);
		int[] arrayActualFirst = removeNumber(array, 0);
		int[] arrayActualMiddle = removeNumber(array, 2);
		assertArrayEquals(arrayExpectedLast, arrayActualLast);
		assertArrayEquals(arrayExpectedFirst, arrayActualFirst);
		assertArrayEquals(arrayExpectedMIddle, arrayActualMiddle);
	}

	@Test
	void insertSortedTest() {
		int[] arrayExpectedLast = { 10, 25, 30, 40, 100, 150 };
		int[] arrayExpectedFirst = { 10,10, 25, 30, 40, 100 };
		int[] arrayExpectedMIddle = { 10, 25, 30,35, 40, 100 };
		int[] arrayActualLast = insertSorted(array, 150);
		int[] arrayActualFirst = insertSorted(array, 10);
		int[] arrayActualMiddle = insertSorted(array, 35);
		assertArrayEquals(arrayExpectedLast, arrayActualLast);
		assertArrayEquals(arrayExpectedFirst, arrayActualFirst);
		assertArrayEquals(arrayExpectedMIddle, arrayActualMiddle);
	}
	@Test
	void copyOfTest() {
		int [] arrayExpectedSameLength ={ 10, 25, 30, 40, 100 };
		int [] arrayExpectedLessLength ={ 10, 25, 30};
		int [] arrayExpectedGreaterLength ={ 10, 25, 30, 40, 100,0 };
		int [] arrayActualSameLeght =Arrays.copyOf(array, array.length);
		int [] arrayActuaLessLeght =Arrays.copyOf(array, array.length-2);
		int [] arrayActualGreaterLeght =Arrays.copyOf(array, array.length+1);
		assertArrayEquals(arrayExpectedSameLength, arrayActualSameLeght);
		assertArrayEquals(arrayExpectedLessLength, arrayActuaLessLeght);
		assertArrayEquals(arrayExpectedGreaterLength, arrayActualGreaterLeght);	
	}
	@Test
	void arraycopyTest() {
		int [] array1= {3,10,20,15};
		int [] expected= { 10, 25, 10, 20, 100 };
		int [] arrayCopy = Arrays.copyOf(array, array.length);
		System.arraycopy(array1, 1, arrayCopy, 2, 2);
		assertArrayEquals(expected, arrayCopy);
	}
	@Test 
	void binarySearchIntTest() {
		//TODO
		int found= Arrays.binarySearch(array, 30);
		int notfound= Arrays.binarySearch(array, 0);
		assertEquals(2, found);
		assertEquals(-1,notfound);
	}
}
